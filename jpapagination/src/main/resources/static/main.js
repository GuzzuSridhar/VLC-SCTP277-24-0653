$(document).ready(function () {
  $(".nBtn, .table .eBtn").on("click", function (event) {
    event.preventDefault();
    var href = $(this).attr("href");
    var text = $(this).text(); //return New or Edit

    if (text === "New Country") {
      $(".myForm #id").val("");
      $(".myForm #name").val("");
      $(".myForm #capital").val("");
      $(".myForm #exampleModal").modal();
    } else if (href.includes("findOne")) {
      var id = href.match(/id=(\d+)/)[1];
      $.get("/findOne", { id: id }, function (country, status) {
        $(".myForm #id").val(country.id);
        $(".myForm #name").val(country.name);
        $(".myForm #capital").val(country.capital);
      });
      $(".myForm #exampleModal").modal(); // show the modal
    }
  });

  $(".table .delBtn").on("click", function (event) {
    event.preventDefault();

    var href = $(this).attr("href");
    var id = href.match(/id=(\d+)/)[1]; // Extract the ID from the href attribute

    var deleteUrl = "/delete?id=" + id;
    // console.log(deleteUrl);
    $("#myModal #delRef").attr("href", deleteUrl);
    $("#myModal").modal(); // show the modal
  });
});
