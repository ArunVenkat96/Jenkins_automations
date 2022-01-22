import groovy.json.JsonSlurper
String Jsonreading(String stage){
	def Jsonval=new JsonSlurper()
    def params=Jsonval.parse(new File("$WORKSPACE"+File.separator+"Build.json"))
	return params[stage]['Content']
}