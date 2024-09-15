<script setup lang="ts">
import { ref } from 'vue'
import createUser from './createUser.vue'


const votes = ref(0);

</script>

<template>

  
  
  <div class="container">
    <h1>Hello, Ola Nordmann!</h1>
    <hr>

    <label for="usr"><b>Poll#42</b></label>
    
    <hr>
    <label class="question"><b>"Pinapple on Pizza: Is it ok? "</b></label>


    <hr>
    <button @click="votes++" type="button" class="yesbtn">Upvote</button>
    <button @click="votes++" type="button" class="nobtn">Downvote</button>

    <label class="votes"><b> {{votes}} Votes </b></label>
    <div class="clearfix">
     
    </div>
  </div>
  

</template>

