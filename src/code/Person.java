package code;

public abstract class Person 
{
    private String message;  // an arbitrarily long, multi-line message
    String internet;
    private String location;
    private String gen;
    private String name;
    
    private boolean male;
    private boolean female;
    boolean f = female;
    boolean m = male;
    
    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     * @param address 
     */
    public Person(String author, String address,String email,String gender)
    {
        name = author;
        location = address;
        internet = email;
        gen = gender;
        
    }
    
    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getName(){
    	return name;
    }
    public void setName() 
    {
    	this.name = name;
    }
    public String getAddress()
    {
        return location;
    }
    public void setAddress(){
    	this.location = location;
    }
    
    public String getEmail()
    {
        return internet;
    }
    public void setEmail(){
    	this.internet = internet;
    }
    
    public String getGender()
    {
    	if (gen == "M"){
    		System.out.println("Male");
    	}
    	else if (gen == "F" )
    	{
    		System.out.println("Female");
    	}
		return "Unspecified";
    }
    public void setgender()
    {
    	this.gen = gen;
    }
    public  String toString()
    {
        return  
        		"\n"+ " Your locaction is: "+ location +":"+ " Your email is: "+ internet +":"+ " Your Gender is: " +":"+ gen;
    }
}
