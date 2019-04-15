package accountApplication;

import java.util.Map;

public class Services {

	public Map<Integer, Account> addAccount(Account account, Map<Integer, Account> map) {
		int temp = 0;

		for (int i = 0; i <= map.size(); i++) {
			if (i > temp) {
				temp = i;
			}
		}
		map.put(temp, account);

		return map;

	}

	public void getAccount(int id, Map<Integer, Account> map) {
		
		if (map.get(Integer.valueOf(id)) != null) {
			System.out.println(map.get(Integer.valueOf(id)));
		}
		
	}

}
