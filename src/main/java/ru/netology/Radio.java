package ru.netology;

public class Radio {
  int radioStationNumber;
  int soundVolume;

  public int getRadioStationNumber() {
    return radioStationNumber;
  }

  public void setRadioStationNumber(int RadioStationNumber) {

    if (RadioStationNumber < 0) {
      return;
    }
    if (RadioStationNumber > 9) {
      return;
    }
    this.radioStationNumber = RadioStationNumber;
  }

  public void nextRadioStationNumber() {

    if (radioStationNumber == 9) {
      radioStationNumber = 0;
    } else {
      radioStationNumber++;
    }
  }

  public void prevRadioStationNumber() {

    if (radioStationNumber == 0) {
      radioStationNumber = 9;
    } else {
      radioStationNumber--;
    }
  }

  /* SoundVolume */

  public int getSoundVolume() {
    return soundVolume;
  }

  public void setSoundVolume(int soundVolume) {
    if (soundVolume < 0) {
      return;
    }
    if (soundVolume > 10) {
      return;
    }
    this.soundVolume = soundVolume;
  }

  public void increaseVolume() {
    if (soundVolume < 10) {
      soundVolume++;
    }
    this.soundVolume = soundVolume;
  }

  public void decreaseVolume() {
    if (soundVolume >= 10) {
      soundVolume--;
    }
    this.soundVolume = soundVolume;
  }

}
