

    $(document).ready(function () {
        let likeVal = document.getElementById('like_check').value
        const itemId = $("#itemId").val();
        const memberId = $("#memberId").val();
        console.log(memberId);
        console.log(likeVal);
        const likeImg = document.getElementById("likeImg")

        if (likeVal > 0) {
        likeImg.src = "/assets/img/like_click.png";
    } else {
        likeImg.src = "/assets/img/like_empty.png";
    }
        // 좋아요 버튼을 클릭 시 실행되는 코드
        $("#likeImg").on("click", function () {
        $.ajax({
        url: '/board/like',
        type: 'POST',
        data: {'boardId': boardId, 'memberId': memberId},
        success: function (data) {
        if (data == 1) {
        $("#likeImg").attr("src", "/assets/img/like_click.png");
        location.href="/board/"+boardId;

    } else {
        $("#likeImg").attr("src", "/assets/img/like_empty.png");
        location.href="/board/"+boardId;
    }
    }, error: function () {
        $("#likeImg").attr("src", "/assets/img/like_click.png");
    console.log('오타 찾으세요')
}

});
});
});