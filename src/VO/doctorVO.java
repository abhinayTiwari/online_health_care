package VO;

public class doctorVO {
	private int  doctorvo_id;
	private String doctorvo_name;
	private String username;
	private String hsptl_address;
	private String hsptl_city;
	private String hsptl_state;
	private String hsptl_zipcode;
	private String doc_dept;
	private String doc_spl;
	private int exp;
	private String Gender;
	private int mobile;
	private String email;
	private String id_num;
	private int prac_start_year;
	
	private String consult_hsptl;
	public doctorVO() {
		exp=0;
	}
	public int getDoctorvo_id() {
		return doctorvo_id;
	}
	public void setDoctorvo_id(int doctorvo_id) {
		this.doctorvo_id = doctorvo_id;
	}
	public String getDoctorvo_name() {
		return doctorvo_name;
	}
	public void setDoctorvo_name(String doctorvo_name) {
		this.doctorvo_name = doctorvo_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHsptl_address() {
		return hsptl_address;
	}
	public void setHsptl_address(String hsptl_address) {
		this.hsptl_address = hsptl_address;
	}
	public String getHsptl_city() {
		return hsptl_city;
	}
	public void setHsptl_city(String hsptl_city) {
		this.hsptl_city = hsptl_city;
	}
	public String getHsptl_state() {
		return hsptl_state;
	}
	public void setHsptl_state(String hsptl_state) {
		this.hsptl_state = hsptl_state;
	}
	public String getHsptl_zipcode() {
		return hsptl_zipcode;
	}
	public void setHsptl_zipcode(String hsptl_zipcode) {
		this.hsptl_zipcode = hsptl_zipcode;
	}
	public String getDoc_dept() {
		return doc_dept;
	}
	public void setDoc_dept(String doc_dept) {
		this.doc_dept = doc_dept;
	}
	public String getDoc_spl() {
		return doc_spl;
	}
	public void setDoc_spl(String doc_spl) {
		this.doc_spl = doc_spl;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getConsult_hsptl() {
		return consult_hsptl;
	}
	public void setConsult_hsptl(String consult_hsptl) {
		this.consult_hsptl = consult_hsptl;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId_num() {
		return id_num;
	}
	public void setId_num(String id_num) {
		this.id_num = id_num;
	}
	public int getPrac_start_year() {
		return prac_start_year;
	}
	public void setPrac_start_year(int prac_start_year) {
		this.prac_start_year = prac_start_year;
	}
	
}
