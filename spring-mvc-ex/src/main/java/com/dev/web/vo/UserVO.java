package com.dev.web.vo;

/**
 * The Class UserVO.
 */
public class UserVO {

	/** The id. */
	private Integer id;

	/** The name. */
	private String name;

	/** The age. */
	private Integer age;

	/** The address. */
	private String address;

	/**
	 * Instantiates a new user vo.
	 */
	public UserVO() {
	}

	/**
	 * Instantiates a new user vo.
	 * 
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param age
	 *            the age
	 * @param address
	 *            the address
	 */
	public UserVO(Integer id, String name, Integer age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age.
	 * 
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 * 
	 * @param age
	 *            the new age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * Gets the address.
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 * 
	 * @param address
	 *            the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
