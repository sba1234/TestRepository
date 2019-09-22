//sample program using constructor to display animal properties
package com.constructor;

public class Animal {
double height;
double weight;
Animal()
{
	height=10.2;
	weight=200.2;
}
Animal(double height,double weight)
{
	this.height=height;
	this.weight=weight;
}
}
