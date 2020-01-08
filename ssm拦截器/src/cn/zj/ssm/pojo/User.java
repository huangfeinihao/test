package cn.zj.ssm.pojo;

public class User {
	private Integer id;
	private  String name;
	private String  password;
	private  Integer  age;
	private  Integer did;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String password, Integer age, Integer did) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.did = did;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", did=" + did + "]";
	}
	
	
	
}
