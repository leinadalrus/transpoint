<script setup lang="ts">
import { reactive } from 'vue'

const searchFinder = reactive({
    name: {
        type: String
    },
    description: {
        type: String
    }
})

function searchItemByName(name: string): string {
    return name
}
</script>

<template>
    <article class="m-4 p-3">
        <input
            type="search"
            name="name"
            class="rounded-md border-stone-900 shadow-sm focus:border-emerald-500 focus:ring-emerald-500"
            placeholder="Search product here..."
            v-model="searchFinder"
        />
        <PrimaryButton
            id=""
            class="m-4 rounded-md bg-emerald-50 text-stone-900"
            type="text"
            @click="(name: string) => searchItemByName(name)"
        >
            Search
        </PrimaryButton>
    </article>
</template>
