<script setup lang="ts">
import { ref } from 'vue'
import { useStoreGallery } from '@/composables/useStoreGallery'
import type { IBeyInfo } from '@/models/IBeyInfo'
const beywatches = ref<IBeyInfo[]>([])
</script>

<template>
    <section>
        <article>
            <div>
                <li v-for="bey in beywatches" :key="bey.id">
                    <ion-card @vue:mounted="useStoreGallery()"></ion-card>
                    <ion-img :src="bey.webviewPath"></ion-img>
                </li>
            </div>
        </article>
    </section>
</template>
