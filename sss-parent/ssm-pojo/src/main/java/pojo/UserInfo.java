package pojo;

import java.util.Date;

public class UserInfo {
	private Integer id;

	private String userCode;

	private String email;

	private String cellPhone;

	private String userName;

	private Integer age;

	private String nickName;

	private Integer sex;

	private String password;

	private Integer passwordStrength;

	private Integer userstatus;

	private Integer provinceId;

	private Integer cityId;

	private Integer districtId;

	private String address;

	private String userPictureAtt;

	private Integer individualType;

	// private Integer validatePhone;

	// private Integer validateEmail;

	// private Integer validateIdCard;

	// private Integer validateBankCard;

	// private Integer validateEnterprise;

	private Date birthday;

	private String description;

	private Date regTime;

	private String regIp;

	private Date loginTime;

	private String bindingQq;

	private String bindingSina;

	private String bindingTencent;

	private Integer userlevel;

	private Integer roleId;

	private Integer inBlackList;

	private Integer loginStatus;

	private Date dateInsert;

	private Date dateUpdate;

	private Integer userInsert;

	private Integer userChanged;

	private String emailCheckcode;

	private Integer deleteMark;
	private String levelCode;

	private String userLoginAccountNo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone == null ? null : cellPhone.trim();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getPasswordStrength() {
		return passwordStrength;
	}

	public void setPasswordStrength(Integer passwordStrength) {
		this.passwordStrength = passwordStrength;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getUserPictureAtt() {
		return userPictureAtt;
	}

	public void setUserPictureAtt(String userPictureAtt) {
		this.userPictureAtt = userPictureAtt == null ? null : userPictureAtt.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp == null ? null : regIp.trim();
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getBindingQq() {
		return bindingQq;
	}

	public void setBindingQq(String bindingQq) {
		this.bindingQq = bindingQq == null ? null : bindingQq.trim();
	}

	public String getBindingSina() {
		return bindingSina;
	}

	public void setBindingSina(String bindingSina) {
		this.bindingSina = bindingSina == null ? null : bindingSina.trim();
	}

	public String getBindingTencent() {
		return bindingTencent;
	}

	public void setBindingTencent(String bindingTencent) {
		this.bindingTencent = bindingTencent == null ? null : bindingTencent.trim();
	}

	public Integer getUserlevel() {
		return userlevel;
	}

	public void setUserlevel(Integer userlevel) {
		this.userlevel = userlevel;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getInBlackList() {
		return inBlackList;
	}

	public void setInBlackList(Integer inBlackList) {
		this.inBlackList = inBlackList;
	}

	public Date getDateInsert() {
		return dateInsert;
	}

	public void setDateInsert(Date dateInsert) {
		this.dateInsert = dateInsert;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public Integer getUserInsert() {
		return userInsert;
	}

	public void setUserInsert(Integer userInsert) {
		this.userInsert = userInsert;
	}

	public Integer getUserChanged() {
		return userChanged;
	}

	public void setUserChanged(Integer userChanged) {
		this.userChanged = userChanged;
	}

	public String getEmailCheckcode() {
		return emailCheckcode;
	}

	public void setEmailCheckcode(String emailCheckcode) {
		this.emailCheckcode = emailCheckcode == null ? null : emailCheckcode.trim();
	}

	public Integer getDeleteMark() {
		return deleteMark;
	}

	public void setDeleteMark(Integer deleteMark) {
		this.deleteMark = deleteMark;
	}

	public Integer getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(Integer userstatus) {
		this.userstatus = userstatus;
	}

	public Integer getIndividualType() {
		return individualType;
	}

	public void setIndividualType(Integer individualType) {
		this.individualType = individualType;
	}

	/*
	 * public Integer getValidatePhone() { return validatePhone; }
	 * 
	 * public void setValidatePhone(Integer validatePhone) { this.validatePhone
	 * = validatePhone; }
	 * 
	 * public Integer getValidateEmail() { return validateEmail; }
	 * 
	 * public void setValidateEmail(Integer validateEmail) { this.validateEmail
	 * = validateEmail; }
	 * 
	 * public Integer getValidateIdCard() { return validateIdCard; }
	 * 
	 * public void setValidateIdCard(Integer validateIdCard) {
	 * this.validateIdCard = validateIdCard; }
	 * 
	 * public Integer getValidateBankCard() { return validateBankCard; }
	 * 
	 * public void setValidateBankCard(Integer validateBankCard) {
	 * this.validateBankCard = validateBankCard; }
	 * 
	 * public Integer getValidateEnterprise() { return validateEnterprise; }
	 * 
	 * public void setValidateEnterprise(Integer validateEnterprise) {
	 * this.validateEnterprise = validateEnterprise; }
	 */

	public Integer getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(Integer loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getUserLoginAccountNo() {
		return userLoginAccountNo;
	}

	public void setUserLoginAccountNo(String userLoginAccountNo) {
		this.userLoginAccountNo = userLoginAccountNo;
	}

}