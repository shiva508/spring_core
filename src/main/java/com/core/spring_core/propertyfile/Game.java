package com.core.spring_core.propertyfile;

public class Game {
private String coach;
private String sport;
public String getCoach() {
	return coach;
}
public void setCoach(String coach) {
	this.coach = coach;
}
public String getSport() {
	return sport;
}
public void setSport(String sport) {
	this.sport = sport;
}
@Override
public String toString() {
	return "Game [coach=" + coach + ", sport=" + sport + "]";
} 

}
