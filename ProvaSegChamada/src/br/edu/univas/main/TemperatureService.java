package br.edu.univas.main;

public class TemperatureService {
	 double currentTemperature;
	 public TemperatureService() {
	 }
	 public double getTemperature() {
	  return currentTemperature;
	 }
	 public void setTemperature(double temperatureInC, double currentTemperature) {
	  this.currentTemperature = currentTemperature;
	 }

}

