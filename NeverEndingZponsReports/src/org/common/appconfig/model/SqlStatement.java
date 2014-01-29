/**
 * 
 */
package org.common.appconfig.model;

/**
 * @author nbabic
 * Java application that reads the XML file collection.librml and defined in the file librml.dtd
 * there’s a main application class called ReadLibrary.class, 
 * a helper called LibraryHandler.class,
 * and a helper class called Book.class.
 */
public class SqlStatement implements ISqlStatement {

	/**
	 * The Book class is used to hold the different elements of each library book
	 * as they’re read from an XML file.
	 */
	private String Value;
	private String Name;
	
	public SqlStatement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValue(String Value) {
		// TODO Auto-generated method stub
		this.Value = Value;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return Value;
	}

	@Override
	public void setName(String Name) {
		// TODO Auto-generated method stub
		this.Name = Name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public String toString() {
		return "SqlStatement [Value=" + Value + ", Name=" + Name + "]";
	}
	
}
