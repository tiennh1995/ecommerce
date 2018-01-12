package com.framgia.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
  private Integer id;
  private String email;
  private String password;
  private String name;
  private String avatar;
  private RoleEnum role;

  public User() {
    super();
  }

  public User(Integer id) {
    super();
    this.id = id;
  }

  public User(Integer id, String email, String password, String name, String avatar,
    RoleEnum role) {
    super();
    this.id = id;
    this.email = email;
    this.password = password;
    this.name = name;
    this.avatar = avatar;
    this.role = role;
  }

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
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }
}
