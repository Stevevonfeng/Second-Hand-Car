package com.SHC.model;

public class Dealers {
	
private String userid;
private String username;
private String email;
private String validatecode;
private String userpassword;
private String phone;
private String birth;
private String adress;
private String country;
private String province;
private String img;
private String status;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getValidatecode() {
	return validatecode;
}
public void setValidatecode(String validatecode) {
	this.validatecode = validatecode;
}
public String getUserpassword() {
	return userpassword;
}
public void setUserpassword(String userpassword) {
	this.userpassword = userpassword;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Dealers [userid=" + userid + ", username=" + username + ", email=" + email + ", validatecode="
			+ validatecode + ", userpassword=" + userpassword + ", phone=" + phone + ", birth=" + birth + ", adress="
			+ adress + ", country=" + country + ", province=" + province + ", img=" + img + ", status=" + status + "]";
}
	

}
