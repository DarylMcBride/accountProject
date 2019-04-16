package accountApplication;

import java.util.Map;

import com.google.gson.Gson;

public class Services {

	public Map<Integer, String> addAccount(Account account, Map<Integer, String> map) {

		map.put(account.getAccountNumber(), account.getfName());

		return map;

	}

	public void getAccount(int id, Map<Integer, String> map) {

		if (map.get(Integer.valueOf(id)) != null) {
			System.out.println(map.get(Integer.valueOf(id)));
		}

	}

	public void getJson(Map<Integer, String> map) {

		System.out.println(new Gson().toJson(map));
	}

	public int getCountFirstName(String fName, Map<Integer, String> map) {
		int result = 0;

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getValue().equals(fName)) {
				result++;
			}
		}

		return result;
	}

}
