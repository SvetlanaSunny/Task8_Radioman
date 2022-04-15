package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

  @Test
  public void getRadioStationNumber() {
    Radio radio = new Radio();
    radio.radioStationNumber = 5;
    int exprcted = 5;
    int actual = radio.getRadioStationNumber();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void setRadioStationNumber() {
    Radio radio = new Radio();
    radio.setRadioStationNumber(5);
    int exprcted = 5;
    int actual = radio.getRadioStationNumber();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void setRadioStationNumberMax() {
    Radio radio = new Radio();
    radio.setRadioStationNumber(10);
    int exprcted = 0;
    int actual = radio.getRadioStationNumber();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void setRadioStationNumberMinus() {
    Radio radio = new Radio();
    radio.setRadioStationNumber(-9);
    int exprcted = 0;
    int actual = radio.getRadioStationNumber();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void nextRadioStationNumber() {
    Radio radio = new Radio();
    radio.nextRadioStationNumber();
    int exprcted = 1;
    int actual = radio.getRadioStationNumber();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void nextRadioStationNumberMax() {
    Radio radio = new Radio();
    radio.radioStationNumber = 9;
    radio.nextRadioStationNumber();
    int exprcted = 0;
    int actual = radio.getRadioStationNumber();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void prevRadioStationNumber() {
    Radio radio = new Radio();
    radio.prevRadioStationNumber();
    int exprcted = 9;
    int actual = radio.getRadioStationNumber();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void prevRadioStationNumberMax() {
    Radio radio = new Radio();
    radio.radioStationNumber = 9;
    radio.prevRadioStationNumber();
    int exprcted = 8;
    int actual = radio.getRadioStationNumber();
    Assertions.assertEquals(exprcted, actual);
  }

  /* SoundVolume */

  @Test
  public void getSoundVolume() {
    Radio currentVolume  = new Radio();
    currentVolume.soundVolume = 10;
    int exprcted = 10;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void getSoundVolumeMin() {
    Radio currentVolume  = new Radio();
    currentVolume.getSoundVolume();
    int exprcted = 0;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void setSoundVolume() {
    Radio currentVolume = new Radio();
    currentVolume.setSoundVolume(2);
    int exprcted = 2;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void setSoundVolumeMinus() {
    Radio currentVolume  = new Radio();
    currentVolume.setSoundVolume(-6);
    int exprcted = 0;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void setSoundVolumeMax() {
    Radio currentVolume  = new Radio();
    currentVolume.setSoundVolume(16);
    int exprcted = 0;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void increaseVolume() {
    Radio currentVolume  = new Radio();
    currentVolume.increaseVolume();
    int exprcted = 1;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void increaseVolumeMax() {
    Radio currentVolume  = new Radio();
    currentVolume.soundVolume=10;
    currentVolume.increaseVolume();
    int exprcted = 10;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }

  @Test
  public void decreaseVolumeMin() {
    Radio currentVolume  = new Radio();
    currentVolume.decreaseVolume();
    int exprcted = 0;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }
  @Test
  public void decreaseVolume() {
    Radio currentVolume  = new Radio();
    currentVolume.soundVolume =10;
    currentVolume.decreaseVolume();
    int exprcted = 9;
    int actual = currentVolume.getSoundVolume();
    Assertions.assertEquals(exprcted, actual);
  }
}
