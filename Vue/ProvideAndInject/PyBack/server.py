from flask import Flask, request,jsonify,Response

app = Flask(__name__)

@app.route("/",methods=["POST","OPTIONS"])
def index():
    if request.method == "OPTIONS":
        resp = Response()
        resp.access_control_allow_headers = "*"
        resp.access_control_allow_origin = "*"
        return resp
    lst = []
    lst.append({"name":"张三","sex":"男","id":"202000000001","out":True})
    lst.append({"name":"李四","sex":"女","id":"202000000002","out":True})
    lst.append({"name":"王五","sex":"男","id":"202000000003","out":False})
    lst.append({"name":"琴柳","sex":"女","id":"202000000004","out":True})
    lst.append({"name":"七七","sex":"女","id":"202000000005","out":False})
    if request.method != "POST":
        resp = jsonify({'status':403,'data':None,'msg':'Method Error. This location can only get post request.'})
    if request.form.get("token","default") == "default":
        resp = jsonify({'status':403,'data':None,'msg':'Form data Error. It should include a token data to verify.'})
    if request.form.get("token","default") == "swpu":
        resp = jsonify({'status':200,'data':lst,'msg':''})
    if request.form.get("token","default") != "swpu":
        resp = jsonify({'status':403,'data':None,'msg':'token data Error.'})
    resp.access_control_allow_origin = "*"
    resp.access_control_allow_headers = "*"
    return resp
    
app.run(port=8000)