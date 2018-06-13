package cn.taiji.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the org database table.
 * 
 */
@Entity
@NamedQuery(name="Org.findAll", query="SELECT o FROM Org o")
public class Org implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to Org
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Org org;

	//bi-directional many-to-one association to Org
	@OneToMany(mappedBy="org")
	private List<Org> orgs;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="org")
	private List<User> users;

	public Org() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Org getOrg() {
		return this.org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	public List<Org> getOrgs() {
		return this.orgs;
	}

	public void setOrgs(List<Org> orgs) {
		this.orgs = orgs;
	}

	public Org addOrg(Org org) {
		getOrgs().add(org);
		org.setOrg(this);

		return org;
	}

	public Org removeOrg(Org org) {
		getOrgs().remove(org);
		org.setOrg(null);

		return org;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setOrg(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setOrg(null);

		return user;
	}

}