package org.observerdesignpattern.finaldesign;

import java.util.List;

public interface Subject {
  public void addObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObserver(List<Observer> observers);

}
