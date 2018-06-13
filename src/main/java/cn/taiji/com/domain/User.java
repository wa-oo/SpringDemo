package cn.taiji.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int age;

	private String name;

	//bi-directional many-to-one association to Money
	@OneToMany(mappedBy="user1")
	private List<Money> moneys;

	//bi-directional one-to-one association to Money
	@OneToOne
	@JoinColumn(name="id")
	private Money money;

	//bi-directional many-to-one association to Org
	@ManyToOne
	private Org org;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Money> getMoneys() {
		return this.moneys;
	}

	public void setMoneys(List<Money> moneys) {
		this.moneys = moneys;
	}

	public Money addMoney(Money money) {
		getMoneys().add(money);
		money.setUser1(this);

		return money;
	}

	public Money removeMoney(Money money) {
		getMoneys().remove(money);
		money.setUser1(null);

		return money;
	}

	public Money getMoney() {
		return this.money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public Org getOrg() {
		return this.org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

}