package tagtry.model;

public class ParseInstallation extends ParseBasic implements DatabaseInterface {
	private String appName;

	public void setAppName(String value) {
		this.appName = value;
	}

	public String getAppName() {
		return this.appName;
	}

	private String appVersion;

	public void setAppVersion(String value) {
		this.appVersion = value;
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	private int badge;

	public void setBadge(int value) {
		this.badge = value;
	}

	public int getBadge() {
		return this.badge;
	}

	private String channels;

	public void setChannels(String value) {
		this.channels = value;
	}

	public String getChannels() {
		return this.channels;
	}

	private String deviceToken;

	public void setDeviceToken(String value) {
		this.deviceToken = value;
	}

	public String getDeviceToken() {
		return this.deviceToken;
	}

	private String deviceType;

	public void setDeviceType(String value) {
		this.deviceType = value;
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	private String installationId;

	public void setInstallationId(String value) {
		this.installationId = value;
	}

	public String getInstallationId() {
		return this.installationId;
	}

	private String parseVersion;

	public void setParseVersion(String value) {
		this.parseVersion = value;
	}

	public String getParseVersion() {
		return this.parseVersion;
	}

	private String timeZone;

	public void setTimeZone(String value) {
		this.timeZone = value;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	/**
	 * <pre>
	 *           1..1     1..1
	 * ParseInstallation ------------------------- Client
	 *           parseInstallation        &lt;       client
	 * </pre>
	 */
	private Client client;

	public void setClient(Client value) {
		this.client = value;
	}

	public Client getClient() {
		return this.client;
	}

	public void save() {
		// TODO Auto-generated method stub

	}

	public void init(String json) {
		// TODO Auto-generated method stub

	}

}
