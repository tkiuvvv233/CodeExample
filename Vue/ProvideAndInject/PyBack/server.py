from flask import Flask, request,jsonify,Response

app = Flask(__name__)

@app.route("/User/findUserAll",methods=["GET","OPTIONS"])
def index():
    if request.method == "OPTIONS":
        resp = Response()
        resp.access_control_allow_headers = "*"
        resp.access_control_allow_origin = "*"
        return resp
    lst = []
    lst.append({"stuName":"张三","sex":"男","id":"202000000001","ifOut":True})
    lst.append({"stuName":"李四","sex":"女","id":"202000000002","ifOut":True})
    lst.append({"stuName":"王五","sex":"男","id":"202000000003","ifOut":False})
    lst.append({"stuName":"琴柳","sex":"女","id":"202000000004","ifOut":True})
    lst.append({"stuName":"七七","sex":"女","id":"202000000005","ifOut":False})
    resp = jsonify({'code':200,'data':lst,'msg':'success'})
    resp.access_control_allow_origin = "*"
    resp.access_control_allow_headers = "*"
    return resp
    
app.run(port=8080)