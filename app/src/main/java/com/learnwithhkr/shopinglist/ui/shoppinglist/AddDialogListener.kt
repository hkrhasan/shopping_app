package com.learnwithhkr.shopinglist.ui.shoppinglist

import com.learnwithhkr.shopinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}