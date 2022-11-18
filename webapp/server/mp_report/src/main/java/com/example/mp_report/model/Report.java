package com.example.mp_report.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "month_report")
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	@Column(name = "Дата")
	private String date;
	@Column(name = "Заказы")
	private int orders_quantity;
	@Column(name = "Продажи")
	private int sells_quantity;
	@Column(name = "Выручка")
	private double revenue;
	@Column(name = "Цена")
	private double price;
	@Column(name = "Остаток")
	private int rests;
	@Column(name = "Процент выкупа")
	private int sells_percentage;
}
