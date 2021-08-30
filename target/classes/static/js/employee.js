const menu = document.querySelector('#mobile-menu');
const menuLinks = document.querySelector('.navbar__menu');

menu.addEventListener('click', function() {
    menu.classList.toggle('is-active');
    menuLinks.classList.toggle('active');
});

$(document).ready(function() {
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        
        $.get(href, function(employee, status) {
            $('#employee-id').val(employee.id);
            $('#employee-first-name-edit').val(employee.firstName);
            $('#employee-last-name-edit').val(employee.lastName);
            $('#employee-email-edit').val(employee.email);
            $('#employee-phone-edit').val(employee.phone);
            $('#employee-department-edit').val(employee.department);

        });

        $('#updateEmployeeModal').modal();

    });
});


$('table #deleteButton').on('click', function(event) {
    event.preventDefault();
    var href = $(this).attr('href');
    $('#confirmDelete').attr('href', href);
    $('#deleteEmployeeModal').modal();
});