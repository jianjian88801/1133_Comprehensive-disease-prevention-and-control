const base = {
    get() {
        return {
            url : "http://localhost:8080/jibingfangkong/",
            name: "jibingfangkong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jibingfangkong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "疾病防控综合系统"
        } 
    }
}
export default base
