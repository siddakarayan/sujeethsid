package com.aventador;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Userdao;
import com.model.User;

import com.dao.Productdao;
import com.model.Product;

@Controller
public class Homecontroller 
{
	HttpSession session;
	private Userdao ud1;
	private Productdao pd;
	
	public Productdao getpd() {
		return pd;
	}
	public void setpd1(Productdao pd) {
		this.pd = pd;
	}
 

	public Userdao getUd1() {
		return ud1;
	}
	public void setUd1(Userdao ud1) {
		this.ud1 = ud1;
	}
	public Homecontroller()
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext appobj = new AnnotationConfigApplicationContext();
		appobj.scan("com.niit.application");
		System.out.println("welcome");
		appobj.refresh();
		ud1=(Userdao)appobj.getBean("udao");
	    pd=(Productdao)appobj.getBean("pdao");
	}
	@RequestMapping("/")
    public ModelAndView helloWorld(){
	return new ModelAndView("home");
}
	@RequestMapping("Adhome")
	public ModelAndView Adhome(){
		return new ModelAndView("Adhome");
	}
	
	@RequestMapping("/home")
	public ModelAndView home(){
		return new ModelAndView("home");
	}
	
	@RequestMapping("/signup")
	public ModelAndView sign(){
		return new ModelAndView("signup");
	}

	@RequestMapping("/login")
	public ModelAndView gotologin(Model model){
		User us = new User();
		model.addAttribute("user",us);
	return new ModelAndView("login");
	}
	
	@RequestMapping("/AboutUs")
	public ModelAndView gotov(){
	return new ModelAndView("AboutUs");
	}	
	@ModelAttribute("user")
	public User us()
	{
		return new User();
	}
	@RequestMapping(value="/signup", method=RequestMethod.GET)
		public String print(Model model)
		{
			User us = new User();
			model.addAttribute("user",us);
			return "signup";
		}
	@RequestMapping(value="/signupenter", method=RequestMethod.POST)
	public String print1(@ModelAttribute(value="user")User us,ModelMap model)
	{
		ud1.save(us);
		return "login";
	}
	
	@ModelAttribute("productForm")
	public Product product(){
		return new Product();
	}
	
	
	@RequestMapping(value="/loginenter", method=RequestMethod.POST)
	public String print(HttpServletRequest req)throws ServletException,IOException
	{
		session=req.getSession(true);
           
		
			String view="";
			List<User> list = ud1.getUser(req.getParameter("email"),req.getParameter("password"));
            System.out.println(list);
			if(!list.isEmpty()){
					for(User role : list){
			if(role.getRole().equals("ADMIN_ROLE"))
			{
				session.setAttribute("username", role.getUsername());
				session.setAttribute("email", role.getEmail());
			
			view= "Adhome";
			}
			
			else if(role.getRole().equals("USERROLE")) 
			{
				session.setAttribute("username", role.getUsername());
				session.setAttribute("email", role.getEmail());
				view = "home";
			}
			
			}
	
	        }
else {
				
				view = "login";
			}
			
			return view;

	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(){
		session.invalidate();
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/Addproducts",method=RequestMethod.GET)
	public String gotoPro(Model model){
		Product  product = new Product();
		model.addAttribute("productFormObj",product);
		return "Addproducts";
		
	}
	
	@RequestMapping(value="/addproduct", method = RequestMethod.POST)
	public String print1(@ModelAttribute(value="productFormObj")Product product,HttpServletRequest req)throws IOException{
 	System.out.println("fileuploaded");  
	pd.insert(product);
	
		MultipartFile files1 = product.getFiles();
		System.out.println(files1.getOriginalFilename());
		
		String path = "C:/Users/WELCOME/git/sujeethsid/Italianfrontend/src/main/webapp/resources/Pdimg/" + product.getProductid()+".jpg";
		System.out.println(path);
				byte[] bytes = files1.getBytes();
				BufferedOutputStream image = new BufferedOutputStream(new FileOutputStream(new File(path)));
				System.out.println(image);
				image.write(bytes);
				image.close();

	    
	      return "redirect:/Productlist";
      
	}
	
	@RequestMapping(value ="/Productlist")
	public ModelAndView gotolist()
	{
		List<Product> prod=pd.Productlist();
		return new ModelAndView("Productlist","lobj",prod);
	}
	
	
	@RequestMapping(value="/view/{pid}")
	public ModelAndView view(@PathVariable(value="pid")int pid,Model model){
		Product product=pd.getproductsbyid(pid);
		System.out.println("ggy");
			System.out.println(product);
			model.addAttribute("showObj",product);
			
		return new ModelAndView("Show");
	}
	 
		 @RequestMapping("/admin/product/editProduct/{pid}")
		 public ModelAndView editProductform(@PathVariable(value="pid")int pid)
		 {
			 Product prod3 = this.pd.getproductsbyid(pid);
			 return new ModelAndView("editProductform","editproductobj",prod3);
		 }   
		 
		 
		 
		 @RequestMapping(value="/admin/product/editProductbyid/",method = RequestMethod.POST)
		 public String edit(@ModelAttribute(value="editproductobj")Product pid)
		 {
			 pd.update(pid);
			 return "redirect:/Productlist";
		 }
		 
		 @RequestMapping("/admin/product/delete/{pid}")
		 public String deleteproductbyid(@PathVariable(value="pid")int pid)
		 {
			 pd.delete(pid);
			return "redirect:/Productlist";
		 }
		
		  @RequestMapping(value="/Categories",method=RequestMethod.GET)
			 public ModelAndView cat1(HttpServletRequest req){
				List<Product> list2 = pd.getproductsbyid(req.getParameter("cat"));
				ModelAndView mv=new ModelAndView("Categories");
				mv.addObject("prod", list2);
				 return mv;
			 }
			
	}
		    


	
	

