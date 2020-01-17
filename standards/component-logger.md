
Logger output should be of this template

<pre>
{loggerUid=Logger-IN, messageFlow=abc, description=abc, inboundProperties=#[message.inboundProperties], payload=#[payload] }          

{loggerUid=Logger-OUT, messageFlow=abc,description=abc inboundProperties=#[message.inboundProperties], outboundProperties=#[message.outboundProperties], payload=#[payload] }

</pre>

LoggerUid is unique for the message flow. Only use number if description such as Logger-IN, Logger-OUT and similar small names are not meaningful. If using numbers in loggerUid then you have to include a description field as shown in the template.

    messageFlow – name of the mulesoft flow or xml file

    description – when numbers are used in loggerUid, then include description field to show what that log gets written.

    inboundProperties, payload, outboundProperties – these are fields with multi value elements. Example shown below.