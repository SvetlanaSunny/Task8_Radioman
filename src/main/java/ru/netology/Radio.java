package ru.netology;

public class Radio {
  protected int radioStationNumber; /* номер радиостанции*/
  protected int soundVolume; /* громкость звука*/
  protected int radioAmount = 10; /* кол-во радиостанций*/

  public Radio(int radioAmount) {
    this.radioAmount = radioAmount;
  }

  public Radio() {
  }

  public int getRadioStationNumber() {
    return radioStationNumber;
  }

  public void setRadioStationNumber(int radioStationNumber) {

    if (radioStationNumber < 0) {
      return;
    }
    if (radioStationNumber > (radioAmount - 1)) {
      return;
    }
    this.radioStationNumber = radioStationNumber;
  }

  public void nextRadioStationNumber() {
    if (radioStationNumber >= radioAmount) {
      this.radioStationNumber = (radioAmount - 1);
    }
    if (radioStationNumber == (radioAmount - 1)) {
      radioStationNumber = 0;
    } else {
      radioStationNumber++;
    }
  }

  public void prevRadioStationNumber() {
    if (radioStationNumber >= radioAmount) {
      this.radioStationNumber = (radioAmount - 1);
    }
    if (radioStationNumber == 0) {
      radioStationNumber = (radioAmount - 1);
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
    if (soundVolume > 100) {
      return;
    }
    this.soundVolume = soundVolume;
  }

  public void increaseVolume() {
    if (soundVolume < 100) {
      soundVolume++;
    }
    this.soundVolume = soundVolume;
  }

  public void decreaseVolume() {
    if (soundVolume > 0) {
      soundVolume--;
    }
    this.soundVolume = soundVolume;
  }

}
