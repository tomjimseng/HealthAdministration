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
        
        $.get(href, function(patients, status) {
            $('#patient-id').val(patients.id);
            $('#patient-first-name-edit').val(patients.firstName);
            $('#patient-last-name-edit').val(patients.lastName);
            $('#patient-email-edit').val(patients.email);
            $('#patient-phone-edit').val(patients.phone);
            $('#patient-blood-type-edit').val(patients.bloodType);
            $('#patient-illness-edit').val(patients.illness);

        });

        $('#updatePatientModal').modal();

    });
});


$('table #deleteButton').on('click', function(event) {
    event.preventDefault();
    var href = $(this).attr('href');
    $('#confirmDelete').attr('href', href);
    $('#deletePatientModal').modal();
});