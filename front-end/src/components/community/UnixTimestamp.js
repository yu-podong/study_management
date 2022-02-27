
function Unix_timestamp(t){//Unix시간=>YYYY-MM-DD로 변환
    var date = new Date(t);
    var year = date.getFullYear();
    var month = "0" + (date.getMonth()+1);
    var day = "0" + date.getDate();

    return year + "-" + month.substr(-2) + "-" + day.substr(-2) ;
}

export default Unix_timestamp;