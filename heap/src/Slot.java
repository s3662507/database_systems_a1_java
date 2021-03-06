///////////////////////////////////////////////////////////////////////////////
// File Written by: Michael A (s3662507) (Last Edit: 27/03/2020)
// Database Systems - Assignment 01
// Purpose of this Class:
// This class is just a notion class to store the Records of the Page
///////////////////////////////////////////////////////////////////////////////
public class Slot {
	///////////////////////////////////////////////////////////////////////////
	////////////////////////////////MEMBERS////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	Record record;
	
	///////////////////////////////////////////////////////////////////////////
	//////////////////////////DEFAULT CONSTRUCTOR//////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	public Slot(Record record) {
		this.record = record;
	}

	///////////////////////////////////////////////////////////////////////////
	////////////////////////////////GETTERS////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	public Record get_record() {
		return record;
	}

	///////////////////////////////////////////////////////////////////////////
	////////////////////////////////SETTERS////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	public void set_record(Record record) {
		this.record = record;
	}
	
}
