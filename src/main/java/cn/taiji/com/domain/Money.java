package cn.taiji.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the money database table.
 * 
 */
@Entity
@NamedQuery(name="Money.findAll", query="SELECT m FROM Money m")
public class Money implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String money;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user1;

	//bi-directional one-to-one association to User
	@OneToOne(mappedBy="money")
	private User user2;

	public Money() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoney() {
		return this.money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

}