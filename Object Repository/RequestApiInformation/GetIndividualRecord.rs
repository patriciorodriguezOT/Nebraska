<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GetIndividualRecord</name>
   <tag></tag>
   <elementGuidId>846daffa-b91f-4435-8090-67a657641fa0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer JhY1mpRSll727I36Io8DOcQ0i2JbWvLPv0lsMBCgIzIu-eL7SG-GrjKNhU9dEzVlEuViUvX7sx7OUmdvHNShL_94_a52emc0b_HfdVBlDjQSoYjQdC21wNq1zLggJWcperARmWb4CCQ-KEX59N_FWFl4TasTcFQCZUcOOcTdTOSYiCSRiQ4bDvmrM29ohD1ahVxqRRfagzTD-9xLEh_oovrWhUItEJQbhzWA1Mk-nyj8ZTRg1h7RcJRaOFp4oFVljtekDIweWpIoaMGDme_Mhwa9eAs0VC5LC7wivWEZOGoy7xe9d7ZGy8kIf_JCqkzJrcuzTCpW4dgnEoJRNezdKyNHm5wQCSty0zruHtbWvwxw09Nv</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${baseUrl}/formtemplates/${formId}/forms?q=[First Name] eq '${applicantFirstName}'&amp;expand=true</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'https://vv5qa.visualvault.com/api/v1/NEDHHS/LIS'</defaultValue>
      <description></description>
      <id>aed7893f-1e43-4fd2-a074-7225c960023a</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>'5cca55d8-129b-ec11-a9d8-a898949011e1'</defaultValue>
      <description></description>
      <id>a56ffc08-0641-4e2e-9ad5-9141c8b2dfd9</id>
      <masked>false</masked>
      <name>formId</name>
   </variables>
   <variables>
      <defaultValue>'PRpekim'</defaultValue>
      <description></description>
      <id>6d69f191-ba12-4075-9ee7-61140520a44e</id>
      <masked>false</masked>
      <name>applicantFirstName</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
