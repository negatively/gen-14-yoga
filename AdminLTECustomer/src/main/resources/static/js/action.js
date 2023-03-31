		function tampilkanTable(){
			$('#cusTable tbody').empty();
			$.getJSON('http://localhost:8080/customerList', function(json){
				var tr=[];
				for (var i = 0; i < json.length; i++) {
					tr.push('<tbody>');
					tr.push('<tr class="bg-white">');
					tr.push('<td></td>');
					tr.push('<td>' + json[i].id + '</td>');
					tr.push('<td>' + json[i].name + '</td>');
					tr.push('<td>' + json[i].email + '</td>');
					tr.push('<td>' + json[i].address + '</td>');
					tr.push('<td><a  class="edit" role="button"><i class="material-icons">&#xE254;</i></a>&nbsp;&nbsp;<a role="button"class="delete" id=' + json[i].id + '><i class="material-icons">&#xE872;</i></a></td>');
					tr.push('</tr>');
					tr.push('</tbody>');
				}
				$('table').append($(tr.join('')));
			})
		}
		
		$(document).ready(function() {
		
				tampilkanTable();
			
			
			$(document).delegate('#addNew', 'click', function(event) {
				event.preventDefault();
				
				var name = $('#name').val();
				var email = $('#email').val();
				var address = $('#address').val();
				
				$.ajax({
					type: "POST",
					contentType: "application/json; charset=utf-8",
					url: "http://localhost:8080/customer/save",
					data: JSON.stringify({'name': name, 'email': email, 'address': address}),
					cache: false,
					success: function(result) {
						$("#msg").html( "<span style='color: green'>Customer added successfully</span>" );
						tampilkanTable();
						$("#add").modal('hide');
					},
					error: function(err) {
						$("#msg").html( "<span style='color: red'>Name is required</span>" );
					}
				});
			});
			
			$(document).delegate('.delete', 'click', function() { 
				if (confirm('Do you really want to delete record?')) {
					var id = $(this).attr('id');
					var parent = $(this).parent().parent();
					$.ajax({
						type: "DELETE",
						url: "http://localhost:8080/customer/delete/" + id,
						cache: false,
						success: function() {
							parent.fadeOut('slow', function() {
								$(this).remove();
							});
							tampilkanTable();
						},
						error: function() {
							$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error deleting record').fadeIn().fadeOut(4000, function() {
								$(this).remove();
							});
						}
					});
				}
			});
			
			$(document).delegate('.edit', 'click', function() {
				var parent = $(this).parent().parent();
				
				var id = parent.children("td:nth-child(2)");
				var name = parent.children("td:nth-child(3)");
				var email = parent.children("td:nth-child(4)");
				var address = parent.children("td:nth-child(5)");
				var buttons = parent.children("td:nth-child(6)");
				
				name.html("<input type='text' id='txtName' value='" + name.html() + "'/>");
				email.html("<input type='text' id='txtEmail' value='" + email.html() + "'/>");
				address.html("<input type='text' id='txtAddress' value='" + address.html() + "'/>");
				buttons.html("<a role='button' id='save'><i class='material-icons'>&#xE876;</i></a>&nbsp;&nbsp;<a role='button' class='delete' id='" + id.html() + "'><i class='material-icons'>&#xE872;</i></a>");
			});
			
			$(document).delegate('#save', 'click', function() {
				var parent = $(this).parent().parent();
				
				var id = parent.children("td:nth-child(2)");
				var name = parent.children("td:nth-child(3)");
				var email = parent.children("td:nth-child(4)");
				var address = parent.children("td:nth-child(5)");
				var buttons = parent.children("td:nth-child(6)");
				
				$.ajax({
					type: "POST",
					contentType: "application/json; charset=utf-8",
					url: "http://localhost:8080/customer/save",
					data: JSON.stringify({'id' : id.html(), 
					'name' : name.children("input[type=text]").val(),
					'email' : email.children("input[type=text]").val(),
					'address' : address.children("input[type=text]").val()}),
					cache: false,
					success: function() {
						name.html(name.children("input[type=text]").val());
						email.html(email.children("input[type=text]").val());
						address.html(address.children("input[type=text]").val());
						buttons.html("<a role=\"button\" class='edit' id='" + id.html() + "'><i class='material-icons'>&#xE254;</i></a>&nbsp;&nbsp;<a role='button' class='delete' id='" + id.html() + "'><i class='material-icons'>&#xE872;</i></a>");
					},
					error: function() {
						$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error updating record').fadeIn().fadeOut(4000, function() {
							$(this).remove();
						});
					}
				});
			});
			
			
			
			$("#searchCust").on("keyup", function() {
    			var value = $(this).val().toLowerCase();
    			$("#cusTable tbody tr").filter(function() {
     			 	$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
   				 });
 			 });
			

		});