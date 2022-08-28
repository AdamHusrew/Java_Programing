package day08_ternariesSwitch;

public class HttpStatus {

    public static void main(String[] args) {
        int statusCode=200;


        String
                status200="200, OK",
                status201="Created",
                status202="Accepted",
                status301="Moved Permanently",
                status303="See Other",
                status304="Not Modified",
                status307="Temporary Redirect",
                status400="Bad Request",
                status401="Unauthorized",
                status403="Forbidden",
                status404="Not Found",
                status410="Gone",
                status500="Internal Server Error",
                status503="Service Unavailable";

        switch (statusCode){
            case 200:
                System.out.println(status200);
                break;
            case 201:
                System.out.println(status201);
                break;
            case 202:
                System.out.println(status202);
                break;
            case 301:
                System.out.println(status301);
                break;
            case 303:
                System.out.println(status303);
                break;
            case 304:
                System.out.println(status304);
                break;
            case 307:
                System.out.println(status307);
                break;
            case 400:
                System.out.println(status400);
                break;
            case 401:
                System.out.println(status401);                );
                break;
            case 403:
                System.out.println(status403);
                break;
            case 404:
                System.out.println(status404);
                break;
            case



        }



    }
}
/*
8. HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use switch statement


 */