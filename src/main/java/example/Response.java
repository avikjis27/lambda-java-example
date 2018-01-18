package example;

public class Response {
	
	private String message;
	private String functionName;
	private String memoryLimit;
	private String timeRemains;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getMemoryLimit() {
		return memoryLimit;
	}

	public void setMemoryLimit(String memoryLimit) {
		this.memoryLimit = memoryLimit;
	}

	public String getTimeRemains() {
		return timeRemains;
	}

	public void setTimeRemains(String timeRemains) {
		this.timeRemains = timeRemains;
	}

	@Override
	public String toString() {
		return "Response [message=" + message + ", functionName=" + functionName + ", memoryLimit=" + memoryLimit
				+ ", timeRemains=" + timeRemains + "]";
	}
	
	
	

}
