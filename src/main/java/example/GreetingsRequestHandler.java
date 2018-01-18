package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GreetingsRequestHandler implements RequestHandler<Request, Response>{

	@Override
	public Response handleRequest(Request request, Context context) {
		Response resp = new Response();
		resp.setFunctionName(context.getFunctionName());
		resp.setMemoryLimit(Integer.valueOf(context.getMemoryLimitInMB()).toString());
		resp.setTimeRemains(Integer.valueOf(context.getRemainingTimeInMillis()).toString());
		resp.setMessage("Hello "+request.getName());
		return resp;
	}

}
