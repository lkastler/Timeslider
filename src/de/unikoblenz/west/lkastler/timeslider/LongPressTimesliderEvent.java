package de.unikoblenz.west.lkastler.timeslider;

/**
 * created if the user triggers a long press event on the TimesliderView.
 * 
 * @author lkastler
 */
public class LongPressTimesliderEvent extends TimesliderEvent {

	@Override
	public String getInfo() {
		return "Long Press";
	}

}
