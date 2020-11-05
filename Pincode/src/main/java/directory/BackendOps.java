package directory;

import java.util.Arrays;

public class BackendOps {

	static ResultPojo resultPojo = new ResultPojo();

	public void computeResults(String areaToSearch) {

		String userInput = areaToSearch.toLowerCase();

		for (String area : CityCodes.chennaiCodes().keySet()) {

			if (area.contains(userInput)) {

				userInput = area;
				break;
			}
		}

		if (CityCodes.chennaiCodes().containsKey(userInput)) {

			int code = CityCodes.chennaiCodes().get(userInput);

			resultPojo.setAreas(Arrays.asList(userInput.toUpperCase()));

			resultPojo.setCode(code);

		} else {

			int value = Integer.parseInt(userInput);

			if (CityCodes.chennaiCodes().containsValue(value)) {

				resultPojo.setCode(value);

				resultPojo.setAreas(CityCodes.getAreas(value));

			}
		}
	}

	public ResultPojo getPojoInstance() {

		return resultPojo;

	}

}
