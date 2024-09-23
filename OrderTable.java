package com.tap.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orderTable")
public class OrderTable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="oid")
	private int oid;
	@Column(name="item")
    private String item;
	@Column(name="price")
	private float price;
	@JoinColumn(name="customer_info")
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	public Customer getCustomer() {
		return customer;}
	public void setCustomer(Customer customer) {
		this.customer = customer;}
	public OrderTable( String item, float price) {
		super();
		this.item = item;
		this.price = price;}
	public OrderTable() {
		super();}
	public int getOid() {
		return oid;}
	public void setOid(int oid) {
		this.oid = oid;}
	public String getItem() {
		return item;}
	public void setItem(String item) {
		this.item = item;}
	public float getPrice() {
		return price;}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	

}
