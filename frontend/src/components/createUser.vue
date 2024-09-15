<script setup lang="ts">
import { ref } from 'vue'


var username : string
var email : string

function postUser(){

        fetch('http://localhost:8080/users/create', {
            method: "POST",
            body: JSON.stringify({
                username: username,
                email: email

            }),
            headers: {
                "Content-Type": "application/json"
            }
            }). then(response => {

                if(response.status == 201){

                    
                }

            }).catch(error =>  {
                alert(error.meessage);
            })
        
    
}



</script>

<template>


  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="usr"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="usr" v-model="username" required>

    <hr>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" v-model="email" required>

    
    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button @click="postUser" type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>

</template>
