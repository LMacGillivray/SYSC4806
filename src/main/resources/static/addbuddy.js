$(document).ready(function() {
    $.ajax({
        url: "localhost:8081/addBuddy"
    }).then(function(data) {
        $('.newbud-id').append(data.id);
        $('.newbud-name').append(data.name);
        $('.newbud-phone').append(data.phone);
    });
});