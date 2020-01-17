
Logger output should be of this template

Logger Message should be duplicated in Notes tab, as it is easier to view and manipulate it from Multiline editor in Notes tab instead of Singleline editor in General tab. 

<pre>
{uid=Logger-IN, file=abc.xml, description=abc, inboundProperties=#[message.inboundProperties], payload=#[payload] }          

{uid=Logger-OUT, file=abc.xml, description=abc inboundProperties=#[message.inboundProperties], outboundProperties=#[message.outboundProperties], payload=#[payload] }

</pre>

    uid - is an identifier for logger and unique for the message flow. Only use number if description such as Logger-IN, Logger-OUT and similar small names are not meaningful. If using numbers in uid then you have to include a description field as shown in the template.
    
    description – when numbers are used in loggerUid, then include description field to show what that log gets written.

    inboundProperties, payload, outboundProperties – these are fields with multi value elements. Example shown below.

    file – name of the mulesoft message flow xml file. 
    In some cases, flow name [code2blog_pollFlow] printed to console includes, filename [code2blog_poll.xml]. See LogSection-1.
    In other cases, file name will not be printed to console. Only project name will be printed. See LogSection-2. Hence it is necessary to include messageFlow field as a parameter that gets printed to console logs. 

- LogSection-1
<pre style='font-size:6px'>
INFO 2020-01-14 19:05:33,103 [[code2blog_poll].HTTP_Listener_Configuration.worker.01] org.mule.api.processor.LoggerMessageProcessor: {loggerUid=Logger-OUT, messageFlow=global_elements, inboundProperties={sec-fetch-mode=navigate, http.request.uri=/global_elements, http.query.string=, sec-fetch-site=none, accept-language=en-US,en;q=0.9, http.query.params=ParameterMap{[]}, http.listener.path=/global_elements, sec-fetch-user=?1, http.remote.address=/127.0.0.1:52915, http.uri.params=ParameterMap{[]}, accept=text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,/;q=0.8,application/signed-exchange;v=b3;q=0.9, host=localhost:8081, upgrade-insecure-requests=1, connection=keep-alive, cache-control=max-age=0, http.version=HTTP/1.1, http.method=GET, accept-encoding=gzip, deflate, br, http.relative.path=/global_elements, http.scheme=http, http.request.path=/global_elements, user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36}, outboundProperties={}, payload=null }
</pre>

- LogSection-2
<pre style='font-size:6px'>
INFO  2020-01-17 13:52:07,723 [[code2blog_poll].HTTP_Listener_Configuration.worker.01] org.mule.api.processor.LoggerMessageProcessor: {loggerUid=Logger-IN, messageFlow=global_elements, inboundProperties={http.request.uri=/global_elements, http.query.string=, accept-language=en-US,en;q=0.5, http.query.params=ParameterMap{[]}, http.listener.path=/global_elements, http.remote.address=/127.0.0.1:58720, http.uri.params=ParameterMap{[]}, accept=text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8, host=localhost:8081, upgrade-insecure-requests=1, connection=keep-alive, http.version=HTTP/1.1, http.method=GET, accept-encoding=gzip, deflate, http.relative.path=/global_elements, http.scheme=http, http.request.path=/global_elements, user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0}, payload=null }
INFO  2020-01-17 13:52:07,730 [[code2blog_poll].HTTP_Listener_Configuration.worker.01] org.mule.api.processor.LoggerMessageProcessor: {loggerUid=Logger-OUT, messageFlow=global_elements, inboundProperties={http.request.uri=/global_elements, http.query.string=, accept-language=en-US,en;q=0.5, http.query.params=ParameterMap{[]}, http.listener.path=/global_elements, http.remote.address=/127.0.0.1:58720, http.uri.params=ParameterMap{[]}, accept=text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8, host=localhost:8081, upgrade-insecure-requests=1, connection=keep-alive, http.version=HTTP/1.1, http.method=GET, accept-encoding=gzip, deflate, http.relative.path=/global_elements, http.scheme=http, http.request.path=/global_elements, user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0}, outboundProperties={}, payload=null } 
INFO  2020-01-17 13:52:08,121 [[code2blog_poll].HTTP_Listener_Configuration.worker.01] com.mulesoft.weave.mule.utils.MuleWeaveFactory$: MimeType was not resolved '*/*' delegating to Java.

</pre>