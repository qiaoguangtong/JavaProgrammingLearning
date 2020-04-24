package list;

public class TV {
	int channel = 1; // Default channel is 1;
	int volumeLevel = 1; // Default volume level is 1;
	boolean on = false; // TV is off

	public TV() {

	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {
		if (newChannel <= 120 && newChannel >= 1)
			channel = newChannel;
	}

	public void setVolume(int newVolumeLevel) {
		if (newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}

	public void channelUp() {
		if (channel >= 1 && channel < 120) {
			channel++;
		}
	}

	public void channelDown() {
		if (channel > 1 && channel <= 120) {
			channel--;
		}
	}

	public void volumeUp() {
		if (volumeLevel >= 1 && volumeLevel < 7) {
			volumeLevel++;
		}
	}

	public void volumeDown() {
		if (volumeLevel > 1 && volumeLevel <= 7) {
			volumeLevel--;
		}
	}
}
