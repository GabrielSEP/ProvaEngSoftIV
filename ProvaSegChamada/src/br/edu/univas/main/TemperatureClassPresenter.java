package br.edu.univas.main;

	public class TemperatureClassPresenter extends TemperatureService 
	implements TemperatureInfo {
	 @Override
	 public double getTemperatureInC() {
	  return currentTemperature;
	 }
	 @Override
	 public double getTemperatureInF() {
	  return cToF(currentTemperature);
	 }
	 @Override
	 public void setTemperatureInC(double temperatureInC) {
	  this.currentTemperature = temperatureInC;
	 }
	 @Override
	 public void setTemperatureInF(double temperatureInF) {
	  this.currentTemperature = fToC(temperatureInF);
	 }
	 private double fToC(double f) {
	  return ((f - 32) * 5 / 9);
	 }
	 private double cToF(double c) {
	  return ((c * 9 / 5) + 32);
	 }
	}

