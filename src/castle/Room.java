package castle;

import java.util.HashMap;

public class Room {
	private String description;
	private HashMap<String, Room> exits = new HashMap<String, Room>();

	public Room(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @param dir  方向
	 * @param room 房间
	 */
	public void setExit(String dir, Room room) {
		exits.put(dir, room);
	}

	@Override
	public String toString() {
		return description;
	}

	/**
	 * 获取房间所有的门
	 * 
	 * @return
	 */
	public String getExitDesc() {
		StringBuffer sb = new StringBuffer();
		for (String dir : exits.keySet()) {
			sb.append(dir);
			sb.append(' ');
		}
		return sb.toString();
	}

	/**
	 * 返回指定方向的房间
	 * 
	 * @return
	 */
	public Room getExit(String direction) {
		return exits.get(direction);
	}
}
