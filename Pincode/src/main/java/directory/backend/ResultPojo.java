package directory.backend;

import java.util.List;

public class ResultPojo {

	private String city = "Chennai";
	private int code;
	private List<String> areas;

	public ResultPojo() {

	}

	public int getCode() {

		return code;

	}

	public void setCode(int code) {

		this.code = code + 600000;

	}

	public List<String> getAreas() {

		return areas;

	}

	public void setAreas(List<String> areas) {

		this.areas = areas;

	}

	public String getCity() {

		return city;

	}

}
