package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;



@Entity
@Table (name= "users")
public class User implements Serializable {
	
			
	private static final long serialVersionUID = -7103856404985011938L;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_user;
	
	public User(){};
	
	public User(@Pattern(regexp = "[a-zA-Z\\s'àèìòù]{1,255}", message = "{error.charsnotallow}") String first_name,
			@Pattern(regexp = "[a-zA-Z\\s'àèìòù]{1,255}", message = "{error.charsnotallow}") String last_name,
			@Pattern(regexp = "[a-zA-Z]{6}\\d{2}[ABCDEHLMPRSTabcdehlmprst]\\d{2}[a-zA-Z]\\d{3}[a-zA-Z]", message = "{error.invalidtaxcode}") String fiscal_code,
			@Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "{error.charsnotallow}") String telephone,
			@Pattern(regexp = "[a-zA-Z0-9\\s'àèìòù.-]{1,255}", message = "{error.charsnotallow}") String address,
			@Pattern(regexp = "[a-zA-Z0-9\\s'àèìòù.-]{1,255}", message = "{error.charsnotallow}") String locality,
			@Pattern(regexp = "[a-zA-Z]{2}", message = "{error.charsnotallow}") String province,
			@Pattern(regexp = "[0-9]{5}", message = "{error.invalidcap}") String postal_code,
			@Pattern(regexp = "[a-zA-Z0-9\\s'àèìòù.-]{1,255}", message = "{error.charsnotallow}") String business_name,
			@Pattern(regexp = "/^BE0[0-9]{3}[.]?[0-9]{3}[.]?[0-9]{3}$/", message = "{error.charsnotallow}") String vat_number,
			@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{1,255}", message = "{error.charsnotallow}") String username,
			@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,20}", message = "{error.notsecurepassword}") String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.fiscal_code = fiscal_code;
		this.telephone = telephone;
		this.address = address;
		this.locality = locality;
		this.province = province;
		this.postal_code = postal_code;
		this.business_name = business_name;
		this.vat_number = vat_number;
		this.username = username;
		this.password = password;
	}

	@Pattern(regexp = "[a-zA-Z\\s'àèìòù]{1,255}", message = "{error.charsnotallow}")
	@Column (name="first_name")
	private String first_name;
	
	@Pattern(regexp = "[a-zA-Z\\s'àèìòù]{1,255}", message = "{error.charsnotallow}")
	@Column(name = "last_name")
	private String last_name;
	
	@Pattern(regexp = "[a-zA-Z]{6}\\d{2}[ABCDEHLMPRSTabcdehlmprst]\\d{2}[a-zA-Z]\\d{3}[a-zA-Z]", message = "{error.invalidtaxcode}")
	@Column
	private String fiscal_code;
	
	@Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "{error.charsnotallow}")
	@Column
	private String telephone;
	
	@Pattern(regexp = "[a-zA-Z0-9\\s'àèìòù.-]{1,255}", message = "{error.charsnotallow}")
	@Column
	private String address;
	
	@Pattern(regexp = "[a-zA-Z0-9\\s'àèìòù.-]{1,255}", message = "{error.charsnotallow}")
	@Column
	private String locality;
	
	
	@Pattern(regexp = "[a-zA-Z]{2}", message = "{error.charsnotallow}")
	@Column
	private String province; 
	
	@Pattern(regexp = "[0-9]{5}", message = "{error.invalidcap}") //discutibile, perchè ho controllato all'estero 
	//ed hanno numeri che vanno da 4 a 8..
	@Column
	private String postal_code;
	
	@Pattern(regexp = "[a-zA-Z0-9\\s'àèìòù.-]{1,255}", message = "{error.charsnotallow}")
	private String business_name;
	
	
	@Pattern (regexp = "/^BE0[0-9]{3}[.]?[0-9]{3}[.]?[0-9]{3}$/", message = "{error.charsnotallow}")
	@Column
	private String vat_number;
	
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{1,255}", message = "{error.charsnotallow}")
	@Column
	private String username;
	

	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,20}", message = "{error.notsecurepassword}")
	@Column
	private String password; 
	
	

	public int getId_user() {
		return id_user;
	}

	
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getFirst_name() {
		return first_name;
	}

	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	
	public String getFiscal_code() {
		return fiscal_code;
	}


	public void setFiscal_code(String fiscal_code) {
		this.fiscal_code = fiscal_code;
	}

	public String getTelephone() {
		return telephone;
	}

	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}

	
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	
	public String getPostal_code() {
		return postal_code;
	}

	
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getBusiness_name() {
		return business_name;
	}

	
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}


	public String getVat_number() {
		return vat_number;
	}

	
	public void setVat_number(String vat_number) {
		this.vat_number = vat_number;
	}

	public String getUsername() {
		return username;
	}

	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
